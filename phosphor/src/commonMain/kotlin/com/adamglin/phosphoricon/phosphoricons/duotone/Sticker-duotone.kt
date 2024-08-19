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

public val DuotoneGroup.`Sticker-duotone`: ImageVector
    get() {
        if (`_sticker-duotone` != null) {
            return `_sticker-duotone`!!
        }
        `_sticker-duotone` = Builder(name = "Sticker-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                curveToRelative(-8.0f, 24.0f, -56.0f, 72.0f, -80.0f, 80.0f)
                verticalLineTo(184.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 32.0f)
                lineTo(88.0f, 32.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 32.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 2.53f, -0.41f)
                curveToRelative(26.23f, -8.75f, 76.31f, -58.83f, 85.06f, -85.06f)
                arcTo(8.07f, 8.07f, 0.0f, false, false, 224.0f, 136.0f)
                lineTo(224.0f, 88.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 168.0f, 32.0f)
                close()
                moveTo(48.0f, 168.0f)
                lineTo(48.0f, 88.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 88.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineToRelative(40.0f)
                lineTo(184.0f, 128.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineToRelative(24.0f)
                lineTo(88.0f, 208.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 48.0f, 168.0f)
                close()
                moveTo(144.0f, 203.14f)
                lineTo(144.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(19.14f)
                curveTo(191.0f, 163.5f, 163.5f, 191.0f, 144.0f, 203.14f)
                close()
            }
        }
        .build()
        return `_sticker-duotone`!!
    }

private var `_sticker-duotone`: ImageVector? = null
