package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Waves-bold`: ImageVector
    get() {
        if (`_waves-bold` != null) {
            return `_waves-bold`!!
        }
        `_waves-bold` = Builder(name = "Waves-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.24f, 174.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.58f, 16.89f)
                curveTo(205.49f, 206.71f, 189.06f, 212.0f, 174.15f, 212.0f)
                curveToRelative(-19.76f, 0.0f, -36.86f, -9.29f, -51.88f, -17.44f)
                curveToRelative(-25.06f, -13.62f, -44.86f, -24.37f, -74.61f, 0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.32f, -18.48f)
                curveToRelative(42.25f, -35.0f, 75.0f, -17.23f, 101.39f, -2.92f)
                curveToRelative(25.06f, 13.61f, 44.86f, 24.37f, 74.61f, -0.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 225.24f, 174.74f)
                close()
                moveTo(208.34f, 117.15f)
                curveToRelative(-29.75f, 24.67f, -49.55f, 13.91f, -74.61f, 0.3f)
                curveToRelative(-26.35f, -14.3f, -59.14f, -32.11f, -101.39f, 2.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.32f, 18.48f)
                curveToRelative(29.75f, -24.67f, 49.55f, -13.92f, 74.61f, -0.3f)
                curveToRelative(15.0f, 8.15f, 32.12f, 17.44f, 51.88f, 17.44f)
                curveToRelative(14.91f, 0.0f, 31.34f, -5.29f, 49.51f, -20.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.32f, -18.48f)
                close()
                moveTo(47.66f, 82.84f)
                curveToRelative(29.75f, -24.67f, 49.55f, -13.92f, 74.61f, -0.3f)
                curveToRelative(15.0f, 8.15f, 32.12f, 17.44f, 51.88f, 17.44f)
                curveToRelative(14.91f, 0.0f, 31.34f, -5.29f, 49.51f, -20.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.32f, -18.48f)
                curveToRelative(-29.75f, 24.67f, -49.55f, 13.92f, -74.61f, 0.3f)
                curveToRelative(-26.35f, -14.3f, -59.14f, -32.11f, -101.39f, 2.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 47.66f, 82.84f)
                close()
            }
        }
        .build()
        return `_waves-bold`!!
    }

private var `_waves-bold`: ImageVector? = null
