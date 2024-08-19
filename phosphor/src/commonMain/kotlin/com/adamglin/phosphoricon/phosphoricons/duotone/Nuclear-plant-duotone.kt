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

public val DuotoneGroup.`Nuclear-plant-duotone`: ImageVector
    get() {
        if (`_nuclear-plant-duotone` != null) {
            return `_nuclear-plant-duotone`!!
        }
        `_nuclear-plant-duotone` = Builder(name = "Nuclear-plant-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(178.33f, 216.0f)
                horizontalLineTo(37.67f)
                curveTo(51.16f, 189.65f, 70.0f, 144.55f, 71.86f, 95.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -7.64f)
                horizontalLineToRelative(56.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 7.64f)
                curveTo(146.0f, 144.55f, 164.84f, 189.65f, 178.33f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                lineTo(219.45f, 208.0f)
                curveTo(208.0f, 187.65f, 186.26f, 143.12f, 184.16f, 95.28f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -15.28f)
                lineTo(79.85f, 80.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -16.0f, 15.34f)
                curveToRelative(-1.64f, 44.0f, -17.35f, 84.83f, -31.12f, 112.66f)
                lineTo(16.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(50.5f, 208.0f)
                curveToRelative(13.56f, -28.93f, 27.74f, -68.94f, 29.35f, -112.0f)
                lineToRelative(55.35f, -0.06f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, 1.0f, 0.06f)
                curveToRelative(1.62f, 43.09f, 15.8f, 83.09f, 29.35f, 112.0f)
                close()
                moveTo(183.26f, 208.0f)
                curveToRelative(-13.7f, -27.69f, -29.32f, -68.29f, -31.09f, -112.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.0f, 45.66f, 20.5f, 88.1f, 33.06f, 112.0f)
                close()
                moveTo(152.0f, 32.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(152.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 32.0f)
                close()
                moveTo(96.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 152.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_nuclear-plant-duotone`!!
    }

private var `_nuclear-plant-duotone`: ImageVector? = null
