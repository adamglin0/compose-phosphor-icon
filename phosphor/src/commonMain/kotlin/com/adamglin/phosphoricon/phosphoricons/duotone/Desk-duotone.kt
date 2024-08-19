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

public val DuotoneGroup.`Desk-duotone`: ImageVector
    get() {
        if (`_desk-duotone` != null) {
            return `_desk-duotone`!!
        }
        `_desk-duotone` = Builder(name = "Desk-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 72.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 64.0f)
                lineTo(8.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(32.0f, 144.0f)
                lineTo(224.0f, 144.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(240.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(32.0f, 80.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(48.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(224.0f, 128.0f)
                lineTo(136.0f, 128.0f)
                lineTo(136.0f, 80.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(88.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 104.0f)
                close()
                moveTo(160.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(168.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_desk-duotone`!!
    }

private var `_desk-duotone`: ImageVector? = null
