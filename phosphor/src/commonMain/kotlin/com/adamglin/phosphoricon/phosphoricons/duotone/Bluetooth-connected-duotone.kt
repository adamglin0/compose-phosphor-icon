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

public val DuotoneGroup.`Bluetooth-connected-duotone`: ImageVector
    get() {
        if (`_bluetooth-connected-duotone` != null) {
            return `_bluetooth-connected-duotone`!!
        }
        `_bluetooth-connected-duotone` = Builder(name = "Bluetooth-connected-duotone", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 80.0f)
                lineToRelative(-64.0f, 48.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(128.0f, 224.0f)
                lineToRelative(64.0f, -48.0f)
                lineToRelative(-64.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.8f, 169.6f)
                lineTo(141.33f, 128.0f)
                lineTo(196.8f, 86.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 32.0f)
                verticalLineToRelative(80.0f)
                lineTo(68.8f, 73.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 12.8f)
                lineTo(114.67f, 128.0f)
                lineTo(59.2f, 169.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, 12.8f)
                lineTo(120.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                close()
                moveTo(136.0f, 48.0f)
                lineToRelative(42.67f, 32.0f)
                lineTo(136.0f, 112.0f)
                close()
                moveTo(136.0f, 208.0f)
                lineTo(136.0f, 144.0f)
                lineToRelative(42.67f, 32.0f)
                close()
                moveTo(60.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 140.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_bluetooth-connected-duotone`!!
    }

private var `_bluetooth-connected-duotone`: ImageVector? = null
