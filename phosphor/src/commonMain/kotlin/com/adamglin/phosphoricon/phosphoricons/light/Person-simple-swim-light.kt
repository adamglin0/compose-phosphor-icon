package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Person-simple-swim-light`: ImageVector
    get() {
        if (`_person-simple-swim-light` != null) {
            return `_person-simple-swim-light`!!
        }
        `_person-simple-swim-light` = Builder(name = "Person-simple-swim-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 102.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 176.0f, 102.0f)
                close()
                moveTo(176.0f, 54.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 54.0f)
                close()
                moveTo(220.62f, 186.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.79f, 8.45f)
                curveToRelative(-16.87f, 14.0f, -32.0f, 19.0f, -45.75f, 19.0f)
                curveToRelative(-18.19f, 0.0f, -34.13f, -8.65f, -48.94f, -16.7f)
                curveToRelative(-26.0f, -14.11f, -48.44f, -26.31f, -81.31f, 1.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 36.17f, 189.0f)
                curveToRelative(39.13f, -32.45f, 68.65f, -16.41f, 94.69f, -2.27f)
                reflectiveCurveToRelative(48.44f, 26.31f, 81.31f, -1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.62f, 186.58f)
                close()
                moveTo(36.17f, 149.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.66f, 9.24f)
                curveToRelative(32.87f, -27.26f, 55.32f, -15.07f, 81.31f, -1.0f)
                curveTo(140.0f, 165.34f, 155.89f, 174.0f, 174.08f, 174.0f)
                curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.66f, -9.24f)
                curveToRelative(-7.48f, 6.2f, -14.43f, 10.36f, -21.0f, 12.92f)
                lineToRelative(-54.81f, -54.82f)
                arcTo(101.31f, 101.31f, 0.0f, false, false, 64.24f, 74.0f)
                lineTo(40.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(64.24f, 86.0f)
                arcToRelative(89.42f, 89.42f, 0.0f, false, true, 45.15f, 12.13f)
                lineToRelative(-32.1f, 32.1f)
                curveTo(64.77f, 131.26f, 51.18f, 136.57f, 36.17f, 149.0f)
                close()
                moveTo(127.88f, 112.36f)
                lineTo(177.42f, 161.91f)
                curveToRelative(-16.3f, 1.26f, -30.78f, -6.6f, -46.56f, -15.17f)
                curveToRelative(-11.63f, -6.32f, -24.0f, -13.0f, -37.51f, -15.6f)
                lineTo(119.5f, 105.0f)
                arcTo(93.92f, 93.92f, 0.0f, false, true, 127.88f, 112.37f)
                close()
            }
        }
        .build()
        return `_person-simple-swim-light`!!
    }

private var `_person-simple-swim-light`: ImageVector? = null
