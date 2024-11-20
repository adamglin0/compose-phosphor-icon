package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 106.0f)
                lineTo(226.49f, 106.0f)
                lineTo(190.58f, 70.1f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, -4.1f)
                lineTo(138.0f, 66.0f)
                lineTo(138.0f, 38.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(100.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(126.0f, 66.0f)
                lineTo(64.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 80.0f)
                verticalLineToRelative(54.0f)
                lineTo(22.0f, 134.0f)
                lineTo(22.0f, 108.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(22.0f, 146.0f)
                lineTo(50.0f, 146.0f)
                verticalLineToRelative(22.69f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, 9.89f)
                lineTo(93.42f, 217.9f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, 4.1f)
                horizontalLineToRelative(77.38f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, -4.1f)
                lineTo(226.49f, 182.0f)
                lineTo(240.0f, 182.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(254.0f, 120.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 240.0f, 106.0f)
                close()
                moveTo(242.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(224.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f)
                lineTo(182.1f, 209.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.58f)
                lineTo(103.31f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f)
                lineTo(62.58f, 170.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.58f, -1.41f)
                lineTo(62.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(180.69f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f)
                lineToRelative(37.66f, 37.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 118.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
