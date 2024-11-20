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

public val LightGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.09f, 146.86f)
                lineTo(190.0f, 124.6f)
                lineTo(190.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, -5.21f)
                lineTo(134.0f, 68.52f)
                lineTo(134.0f, 46.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 34.0f)
                lineTo(134.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 34.0f)
                lineTo(104.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 68.52f)
                lineTo(69.0f, 98.79f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 66.0f, 104.0f)
                verticalLineToRelative(20.6f)
                lineTo(28.91f, 146.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 227.09f, 146.86f)
                close()
                moveTo(38.0f, 155.4f)
                lineToRelative(28.0f, -16.8f)
                lineTo(66.0f, 210.0f)
                lineTo(38.0f, 210.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(42.0f)
                lineTo(78.0f, 210.0f)
                lineTo(78.0f, 107.48f)
                lineToRelative(50.0f, -28.57f)
                lineToRelative(50.0f, 28.57f)
                lineTo(178.0f, 210.0f)
                lineTo(150.0f, 210.0f)
                lineTo(150.0f, 168.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 128.0f, 146.0f)
                close()
                moveTo(218.0f, 210.0f)
                lineTo(190.0f, 210.0f)
                lineTo(190.0f, 138.6f)
                lineToRelative(28.0f, 16.8f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
