package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 148.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(204.0f, 140.0f)
                lineTo(204.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(203.89f, 108.0f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, -23.37f, -50.86f)
                lineToRelative(22.31f, -22.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(174.44f, 51.9f)
                arcToRelative(75.77f, 75.77f, 0.0f, false, false, -92.88f, 0.0f)
                lineTo(58.83f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(75.48f, 57.14f)
                arcTo(75.8f, 75.8f, 0.0f, false, false, 52.11f, 108.0f)
                lineTo(32.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(32.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 148.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(75.41f, 75.41f, 0.0f, false, false, 1.0f, 12.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(54.69f, 180.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 146.62f, 0.0f)
                lineTo(224.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(203.0f, 172.0f)
                arcToRelative(75.41f, 75.41f, 0.0f, false, false, 1.0f, -12.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, true, 67.87f, 64.0f)
                lineTo(60.13f, 108.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(132.0f, 227.87f)
                lineTo(132.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(83.87f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 60.0f, 160.0f)
                lineTo(60.0f, 116.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(44.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 132.0f, 227.87f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
