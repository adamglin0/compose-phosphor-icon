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

public val DuotoneGroup.`Spade-duotone`: ImageVector
    get() {
        if (`_spade-duotone` != null) {
            return `_spade-duotone`!!
        }
        `_spade-duotone` = Builder(name = "Spade-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -79.55f, 36.18f)
                lineTo(160.0f, 224.0f)
                horizontalLineTo(96.0f)
                lineToRelative(15.55f, -51.82f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 32.0f, 136.0f)
                curveToRelative(0.0f, -64.0f, 96.0f, -112.0f, 96.0f, -112.0f)
                reflectiveCurveTo(224.0f, 72.0f, 224.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.58f, 16.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                curveTo(120.32f, 18.9f, 24.0f, 67.84f, 24.0f, 136.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 74.15f, 53.0f)
                lineTo(88.34f, 221.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 232.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.66f, -10.3f)
                lineTo(157.85f, 189.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 232.0f, 136.0f)
                curveTo(232.0f, 67.84f, 135.68f, 18.9f, 131.58f, 16.85f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -26.29f, -9.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.92f, 8.33f)
                lineTo(149.25f, 216.0f)
                horizontalLineToRelative(-42.5f)
                lineToRelative(12.46f, -41.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.92f, -8.33f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 40.0f, 136.0f)
                curveToRelative(0.0f, -29.88f, 24.41f, -56.55f, 44.89f, -73.66f)
                arcTo(279.13f, 279.13f, 0.0f, false, true, 128.0f, 33.06f)
                arcToRelative(279.13f, 279.13f, 0.0f, false, true, 43.11f, 29.28f)
                curveTo(208.21f, 93.34f, 216.0f, 119.51f, 216.0f, 136.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_spade-duotone`!!
    }

private var `_spade-duotone`: ImageVector? = null
