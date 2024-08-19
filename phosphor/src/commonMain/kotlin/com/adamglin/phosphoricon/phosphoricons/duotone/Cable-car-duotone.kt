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

public val DuotoneGroup.`Cable-car-duotone`: ImageVector
    get() {
        if (`_cable-car-duotone` != null) {
            return `_cable-car-duotone`!!
        }
        `_cable-car-duotone` = Builder(name = "Cable-car-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineTo(192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.87f, 30.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.28f, -6.46f)
                lineToRelative(-224.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 80.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 1.42f, -0.12f)
                lineTo(120.0f, 61.56f)
                lineTo(120.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(224.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(136.0f, 96.0f)
                lineTo(136.0f, 58.7f)
                lineTo(241.4f, 39.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.87f, 30.59f)
                close()
                moveTo(104.0f, 160.0f)
                lineTo(104.0f, 112.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(64.0f, 112.0f)
                lineTo(88.0f, 112.0f)
                verticalLineToRelative(48.0f)
                lineTo(48.0f, 160.0f)
                lineTo(48.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 112.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(64.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 176.0f)
                lineTo(208.0f, 176.0f)
                verticalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 208.0f)
                close()
                moveTo(208.0f, 128.0f)
                verticalLineToRelative(32.0f)
                lineTo(168.0f, 160.0f)
                lineTo(168.0f, 112.0f)
                horizontalLineToRelative(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cable-car-duotone`!!
    }

private var `_cable-car-duotone`: ImageVector? = null
