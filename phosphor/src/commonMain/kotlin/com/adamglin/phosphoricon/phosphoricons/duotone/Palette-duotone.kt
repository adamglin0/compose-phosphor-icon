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

public val DuotoneGroup.`Palette-duotone`: ImageVector
    get() {
        if (`_palette-duotone` != null) {
            return `_palette-duotone`!!
        }
        `_palette-duotone` = Builder(name = "Palette-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 127.17f)
                arcToRelative(96.48f, 96.48f, 0.0f, false, true, -2.39f, 22.18f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 198.21f, 168.0f)
                horizontalLineTo(152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -32.0f, 22.61f)
                curveTo(58.73f, 201.44f, 32.0f, 169.81f, 32.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 95.0f, -96.0f)
                curveTo(179.84f, 31.47f, 223.55f, 74.35f, 224.0f, 127.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.77f, 53.89f)
                arcTo(103.27f, 103.27f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-1.07f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 24.0f, 128.0f)
                curveToRelative(0.0f, 43.0f, 26.58f, 79.06f, 69.36f, 94.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(46.21f)
                arcToRelative(31.81f, 31.81f, 0.0f, false, false, 31.2f, -24.88f)
                arcToRelative(104.43f, 104.43f, 0.0f, false, false, 2.59f, -24.0f)
                arcTo(103.28f, 103.28f, 0.0f, false, false, 200.77f, 53.89f)
                close()
                moveTo(213.77f, 147.6f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 198.21f, 160.0f)
                lineTo(152.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -21.31f, 15.07f)
                curveTo(62.49f, 194.3f, 40.0f, 164.0f, 40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 87.09f, -88.0f)
                horizontalLineToRelative(0.9f)
                arcToRelative(88.35f, 88.35f, 0.0f, false, true, 88.0f, 87.25f)
                arcTo(88.86f, 88.86f, 0.0f, false, true, 213.81f, 147.6f)
                close()
                moveTo(140.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 76.0f)
                close()
                moveTo(96.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 100.0f)
                close()
                moveTo(96.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 156.0f)
                close()
                moveTo(184.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_palette-duotone`!!
    }

private var `_palette-duotone`: ImageVector? = null
