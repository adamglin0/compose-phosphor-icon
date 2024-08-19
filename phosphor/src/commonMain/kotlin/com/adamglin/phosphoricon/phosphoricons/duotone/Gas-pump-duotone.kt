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

public val DuotoneGroup.`Gas-pump-duotone`: ImageVector
    get() {
        if (`_gas-pump-duotone` != null) {
            return `_gas-pump-duotone`!!
        }
        `_gas-pump-duotone` = Builder(name = "Gas-pump-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 56.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 40.0f)
                horizontalLineToRelative(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 69.66f)
                lineTo(221.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(229.66f, 81.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 86.63f)
                lineTo(232.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(176.0f, 104.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(72.0f, 32.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 48.0f, 56.0f)
                lineTo(48.0f, 208.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(176.0f, 208.0f)
                lineTo(176.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                lineTo(248.0f, 86.63f)
                arcTo(23.85f, 23.85f, 0.0f, false, false, 241.0f, 69.66f)
                close()
                moveTo(64.0f, 208.0f)
                lineTo(64.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(160.0f, 208.0f)
                close()
                moveTo(144.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_gas-pump-duotone`!!
    }

private var `_gas-pump-duotone`: ImageVector? = null
