package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Eye-slash`: ImageVector
    get() {
        if (`_eye-slash` != null) {
            return `_eye-slash`!!
        }
        `_eye-slash` = Builder(name = "Eye-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(61.32f, 66.55f)
                curveTo(25.0f, 88.84f, 9.38f, 123.2f, 8.69f, 124.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f)
                curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f)
                curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f)
                arcToRelative(127.11f, 127.11f, 0.0f, false, false, 52.07f, -10.83f)
                lineToRelative(22.0f, 24.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(101.25f, 110.46f)
                lineTo(142.92f, 156.31f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -41.67f, -45.85f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-30.78f, 0.0f, -57.67f, -11.19f, -79.93f, -33.25f)
                arcTo(133.16f, 133.16f, 0.0f, false, true, 25.0f, 128.0f)
                curveToRelative(4.69f, -8.79f, 19.66f, -33.39f, 47.35f, -49.38f)
                lineToRelative(18.0f, 19.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 63.66f, 70.0f)
                lineToRelative(14.73f, 16.2f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(134.0f, 96.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, -15.72f)
                arcToRelative(48.16f, 48.16f, 0.0f, false, true, 38.77f, 42.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.22f, 8.71f)
                arcToRelative(6.39f, 6.39f, 0.0f, false, true, -0.75f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.26f)
                arcTo(32.09f, 32.09f, 0.0f, false, false, 134.0f, 96.57f)
                close()
                moveTo(247.28f, 131.26f)
                curveToRelative(-0.42f, 0.94f, -10.55f, 23.37f, -33.36f, 43.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.67f, -11.92f)
                arcTo(132.77f, 132.77f, 0.0f, false, false, 231.05f, 128.0f)
                arcToRelative(133.15f, 133.15f, 0.0f, false, false, -23.12f, -30.77f)
                curveTo(185.67f, 75.19f, 158.78f, 64.0f, 128.0f, 64.0f)
                arcToRelative(118.37f, 118.37f, 0.0f, false, false, -19.36f, 1.57f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 106.0f, 49.79f)
                arcTo(134.0f, 134.0f, 0.0f, false, true, 128.0f, 48.0f)
                curveToRelative(34.88f, 0.0f, 66.57f, 13.26f, 91.66f, 38.35f)
                curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 247.31f, 131.26f)
                close()
            }
        }
        .build()
        return `_eye-slash`!!
    }

private var `_eye-slash`: ImageVector? = null
