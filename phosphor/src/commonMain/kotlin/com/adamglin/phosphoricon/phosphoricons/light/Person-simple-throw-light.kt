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

public val LightGroup.`Person-simple-throw-light`: ImageVector
    get() {
        if (`_person-simple-throw-light` != null) {
            return `_person-simple-throw-light`!!
        }
        `_person-simple-throw-light` = Builder(name = "Person-simple-throw-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 86.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 56.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 86.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(50.0f, 96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 50.0f, 96.0f)
                close()
                moveTo(220.68f, 109.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.41f, 1.0f)
                curveToRelative(-1.17f, -0.92f, -25.06f, -18.91f, -62.52f, 0.94f)
                arcToRelative(214.64f, 214.64f, 0.0f, false, true, -3.23f, 32.38f)
                lineToRelative(33.32f, 27.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.85f, 6.51f)
                lineToRelative(-16.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.38f, -3.8f)
                lineTo(169.0f, 178.0f)
                lineToRelative(-25.49f, -21.25f)
                arcToRelative(141.0f, 141.0f, 0.0f, false, true, -5.86f, 17.07f)
                curveTo(124.15f, 206.0f, 100.0f, 227.48f, 65.73f, 237.75f)
                arcTo(6.14f, 6.14f, 0.0f, false, true, 64.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.72f, -11.75f)
                curveToRelative(64.82f, -19.45f, 73.42f, -78.76f, 75.11f, -107.41f)
                curveTo(109.0f, 137.65f, 86.8f, 142.0f, 72.39f, 142.0f)
                curveToRelative(-11.71f, 0.0f, -18.29f, -2.86f, -18.88f, -3.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.0f, -10.92f)
                curveToRelative(0.21f, 0.09f, 27.6f, 11.28f, 74.14f, -20.35f)
                curveToRelative(26.44f, -18.0f, 48.5f, -19.0f, 62.36f, -16.67f)
                curveToRelative(15.37f, 2.57f, 24.39f, 9.7f, 24.76f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.68f, 109.35f)
                close()
            }
        }
        .build()
        return `_person-simple-throw-light`!!
    }

private var `_person-simple-throw-light`: ImageVector? = null
