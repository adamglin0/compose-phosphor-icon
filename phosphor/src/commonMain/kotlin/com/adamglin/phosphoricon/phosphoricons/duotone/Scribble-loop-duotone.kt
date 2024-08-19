package com.adamglin.phosphoricon.phosphoricons.duotone

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
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Scribble-loop-duotone`: ImageVector
    get() {
        if (`_scribble-loop-duotone` != null) {
            return `_scribble-loop-duotone`!!
        }
        `_scribble-loop-duotone` = Builder(name = "Scribble-loop-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(108.6f, 208.0f)
                curveToRelative(-64.0f, 0.0f, -64.0f, -96.0f, 32.0f, -96.0f)
                arcToRelative(134.44f, 134.44f, 0.0f, false, true, 44.73f, 7.83f)
                horizontalLineToRelative(0.0f)
                curveTo(187.0f, 162.36f, 159.88f, 208.0f, 108.6f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.93f, 154.63f)
                curveToRelative(-1.32f, -1.46f, -24.09f, -26.22f, -61.0f, -40.56f)
                curveToRelative(-1.72f, -18.42f, -8.46f, -35.17f, -19.41f, -47.92f)
                curveTo(158.87f, 49.0f, 137.58f, 40.0f, 112.0f, 40.0f)
                curveTo(60.48f, 40.0f, 26.89f, 86.18f, 25.49f, 88.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 9.31f)
                curveTo(38.8f, 97.05f, 68.81f, 56.0f, 112.0f, 56.0f)
                curveToRelative(20.77f, 0.0f, 37.86f, 7.11f, 49.41f, 20.57f)
                curveToRelative(7.42f, 8.64f, 12.44f, 19.69f, 14.67f, 32.0f)
                arcTo(140.87f, 140.87f, 0.0f, false, false, 140.6f, 104.0f)
                curveToRelative(-26.06f, 0.0f, -47.93f, 6.81f, -63.26f, 19.69f)
                curveTo(63.78f, 135.09f, 56.0f, 151.0f, 56.0f, 167.25f)
                arcTo(47.59f, 47.59f, 0.0f, false, false, 69.87f, 201.3f)
                curveToRelative(9.66f, 9.62f, 23.06f, 14.7f, 38.73f, 14.7f)
                curveToRelative(51.81f, 0.0f, 81.18f, -42.13f, 84.49f, -84.42f)
                arcToRelative(161.43f, 161.43f, 0.0f, false, true, 49.0f, 33.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.86f, -10.74f)
                close()
                moveTo(159.47f, 176.27f)
                curveTo(150.64f, 187.09f, 134.66f, 200.0f, 108.6f, 200.0f)
                curveTo(83.32f, 200.0f, 72.0f, 183.55f, 72.0f, 167.25f)
                curveTo(72.0f, 144.49f, 93.47f, 120.0f, 140.6f, 120.0f)
                arcToRelative(124.34f, 124.34f, 0.0f, false, true, 36.78f, 5.68f)
                curveTo(176.93f, 144.44f, 170.46f, 162.78f, 159.47f, 176.27f)
                close()
            }
        }
        .build()
        return `_scribble-loop-duotone`!!
    }

private var `_scribble-loop-duotone`: ImageVector? = null
