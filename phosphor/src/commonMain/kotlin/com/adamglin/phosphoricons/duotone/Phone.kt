package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.94f, 174.08f)
                arcTo(48.33f, 48.33f, 0.0f, false, true, 176.0f, 216.0f)
                arcTo(136.0f, 136.0f, 0.0f, false, true, 40.0f, 80.0f)
                arcTo(48.33f, 48.33f, 0.0f, false, true, 81.92f, 32.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 4.8f)
                lineToRelative(21.13f, 47.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.66f, 7.53f)
                lineTo(89.32f, 117.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, -0.54f, 7.81f)
                curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 7.83f, -0.59f)
                lineToRelative(25.0f, -21.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.59f, -0.69f)
                lineToRelative(47.16f, 21.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.94f, 174.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.37f, 158.46f)
                lineToRelative(-47.11f, -21.11f)
                lineToRelative(-0.13f, -0.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.17f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f)
                lineTo(134.87f, 160.0f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f)
                lineToRelative(0.0f, -0.12f)
                lineTo(97.54f, 33.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.52f)
                arcTo(56.26f, 56.26f, 0.0f, false, false, 32.0f, 80.0f)
                curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f)
                arcToRelative(56.26f, 56.26f, 0.0f, false, false, 55.88f, -48.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 222.37f, 158.46f)
                close()
                moveTo(176.0f, 208.0f)
                arcTo(128.14f, 128.14f, 0.0f, false, true, 48.0f, 80.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 82.87f, 40.0f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f)
                lineToRelative(21.0f, 47.0f)
                lineTo(83.2f, 111.86f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, -0.57f, 0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, 15.7f)
                curveToRelative(9.06f, 18.53f, 27.73f, 37.06f, 46.46f, 46.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.75f, -1.14f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, 0.74f, -0.56f)
                lineTo(168.89f, 152.0f)
                lineToRelative(47.0f, 21.05f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.08f, 0.0f, 0.11f, 0.0f)
                arcTo(40.21f, 40.21f, 0.0f, false, true, 176.0f, 208.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
