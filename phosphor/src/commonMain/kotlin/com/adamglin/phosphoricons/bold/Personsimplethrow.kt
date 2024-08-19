package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Personsimplethrow: ImageVector
    get() {
        if (_personsimplethrow != null) {
            return _personsimplethrow!!
        }
        _personsimplethrow = Builder(name = "Personsimplethrow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 92.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 92.0f, 56.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(44.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 96.0f)
                close()
                moveTo(228.0f, 113.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.49f, 123.0f)
                reflectiveCurveToRelative(-21.0f, -15.48f, -53.34f, 0.28f)
                curveToRelative(-0.34f, 4.75f, -1.0f, 10.94f, -2.13f, 18.0f)
                lineToRelative(30.66f, 25.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.7f, 13.0f)
                lineToRelative(-16.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.76f, -7.59f)
                lineTo(162.0f, 180.0f)
                lineToRelative(-15.44f, -12.86f)
                arcToRelative(136.39f, 136.39f, 0.0f, false, true, -5.72f, 14.23f)
                curveToRelative(-14.64f, 31.0f, -39.34f, 51.93f, -73.42f, 62.15f)
                arcTo(11.82f, 11.82f, 0.0f, false, true, 64.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.45f, -23.5f)
                curveToRelative(37.84f, -11.35f, 60.77f, -38.71f, 68.41f, -81.44f)
                curveToRelative(-24.0f, 13.54f, -43.11f, 17.0f, -56.46f, 17.0f)
                arcTo(65.87f, 65.87f, 0.0f, false, true, 51.0f, 152.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.72f, -21.93f)
                curveToRelative(0.43f, 0.17f, 25.42f, 9.53f, 68.5f, -19.76f)
                curveToRelative(54.71f, -37.18f, 94.26f, -6.38f, 94.26f, -6.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 113.6f)
                close()
            }
        }
        .build()
        return _personsimplethrow!!
    }

private var _personsimplethrow: ImageVector? = null
