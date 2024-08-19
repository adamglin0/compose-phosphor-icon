package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Person-simple-swim-thin`: ImageVector
    get() {
        if (`_person-simple-swim-thin` != null) {
            return `_person-simple-swim-thin`!!
        }
        `_person-simple-swim-thin` = Builder(name = "Person-simple-swim-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 176.0f, 100.0f)
                close()
                moveTo(176.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 52.0f)
                close()
                moveTo(219.08f, 187.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.53f, 5.63f)
                curveTo(203.56f, 205.9f, 188.9f, 212.0f, 173.93f, 212.0f)
                arcToRelative(54.84f, 54.84f, 0.0f, false, true, -6.12f, -0.34f)
                curveToRelative(-15.0f, -1.65f, -28.6f, -9.0f, -41.72f, -16.14f)
                curveToRelative(-25.52f, -13.86f, -49.62f, -27.0f, -83.54f, 1.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, -6.16f)
                curveToRelative(17.0f, -14.12f, 33.62f, -20.07f, 50.74f, -18.19f)
                curveToRelative(15.0f, 1.65f, 28.6f, 9.0f, 41.72f, 16.14f)
                curveToRelative(25.52f, 13.86f, 49.62f, 26.94f, 83.54f, -1.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.08f, 187.84f)
                close()
                moveTo(40.0f, 84.0f)
                lineTo(64.24f, 84.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, 48.37f, 13.73f)
                lineTo(78.19f, 132.16f)
                curveToRelative(-13.63f, 1.0f, -27.0f, 7.0f, -40.74f, 18.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.1f, 6.16f)
                curveToRelative(33.92f, -28.13f, 58.0f, -15.0f, 83.54f, -1.18f)
                curveToRelative(13.12f, 7.12f, 26.69f, 14.49f, 41.72f, 16.14f)
                arcToRelative(54.84f, 54.84f, 0.0f, false, false, 6.12f, 0.34f)
                curveToRelative(15.0f, 0.0f, 29.63f, -6.1f, 44.62f, -18.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.1f, -6.16f)
                curveToRelative(-8.12f, 6.73f, -15.68f, 11.1f, -22.83f, 13.66f)
                lineTo(135.0f, 105.29f)
                arcTo(99.34f, 99.34f, 0.0f, false, false, 64.24f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(181.66f, 163.32f)
                curveToRelative(-18.77f, 3.07f, -35.0f, -5.71f, -51.75f, -14.83f)
                curveToRelative(-12.83f, -7.0f, -26.09f, -14.15f, -40.73f, -16.0f)
                lineToRelative(30.16f, -30.16f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 9.95f, 8.63f)
                close()
            }
        }
        .build()
        return `_person-simple-swim-thin`!!
    }

private var `_person-simple-swim-thin`: ImageVector? = null
