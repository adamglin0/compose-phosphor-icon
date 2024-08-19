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

public val DuotoneGroup.`Text-subscript-duotone`: ImageVector
    get() {
        if (`_text-subscript-duotone` != null) {
            return `_text-subscript-duotone`!!
        }
        `_text-subscript-duotone` = Builder(name = "Text-subscript-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 72.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(43.17f, -57.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.86f, -15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f)
                arcToRelative(32.18f, 32.18f, 0.0f, false, true, 4.63f, -8.59f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 51.11f, 38.52f)
                lineTo(208.0f, 200.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f)
                close()
                moveTo(149.24f, 50.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.81f)
                lineTo(92.0f, 103.78f)
                lineToRelative(-45.95f, -53.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.0f, 61.24f)
                lineTo(81.41f, 116.0f)
                lineTo(34.0f, 170.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.1f, 10.48f)
                lineToRelative(46.0f, -53.0f)
                lineToRelative(45.95f, 53.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.1f, -10.48f)
                lineTo(102.59f, 116.0f)
                lineToRelative(47.46f, -54.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 149.24f, 50.0f)
                close()
            }
        }
        .build()
        return `_text-subscript-duotone`!!
    }

private var `_text-subscript-duotone`: ImageVector? = null
