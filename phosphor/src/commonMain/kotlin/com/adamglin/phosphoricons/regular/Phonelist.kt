package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Phonelist: ImageVector
    get() {
        if (_phonelist != null) {
            return _phonelist!!
        }
        _phonelist = Builder(name = "Phonelist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.36f, 166.46f)
                lineToRelative(-47.1f, -21.11f)
                lineToRelative(-0.12f, -0.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.18f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f)
                lineTo(126.87f, 168.0f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.0f, -0.12f)
                lineTo(89.54f, 41.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.52f)
                arcTo(56.26f, 56.26f, 0.0f, false, false, 24.0f, 88.0f)
                curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f)
                arcToRelative(56.26f, 56.26f, 0.0f, false, false, 55.88f, -48.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 214.36f, 166.46f)
                close()
                moveTo(168.0f, 216.0f)
                arcTo(128.14f, 128.14f, 0.0f, false, true, 40.0f, 88.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 74.87f, 48.0f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f)
                lineToRelative(21.0f, 47.0f)
                lineTo(75.2f, 119.86f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, -0.57f, 0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, 15.7f)
                curveToRelative(9.06f, 18.53f, 27.73f, 37.06f, 46.46f, 46.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.75f, -1.14f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, false, 0.74f, -0.57f)
                lineTo(160.89f, 160.0f)
                lineToRelative(47.0f, 21.06f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.08f, 0.0f, 0.11f, 0.0f)
                arcTo(40.21f, 40.21f, 0.0f, false, true, 168.0f, 216.0f)
                close()
                moveTo(136.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(144.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 64.0f)
                close()
                moveTo(136.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(144.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 104.0f)
                close()
            }
        }
        .build()
        return _phonelist!!
    }

private var _phonelist: ImageVector? = null
