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

public val DuotoneGroup.`Road-horizon-duotone`: ImageVector
    get() {
        if (`_road-horizon-duotone` != null) {
            return `_road-horizon-duotone`!!
        }
        `_road-horizon-duotone` = Builder(name = "Road-horizon-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 192.0f)
                horizontalLineTo(24.0f)
                lineTo(96.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.92f, 199.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 225.0f, 195.92f)
                lineTo(155.32f, 72.0f)
                lineTo(136.0f, 72.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 72.0f)
                lineTo(100.68f, 72.0f)
                lineTo(31.0f, 195.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 17.0f, 188.08f)
                lineTo(82.32f, 72.0f)
                lineTo(24.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(173.68f, 72.0f)
                lineTo(239.0f, 188.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 235.92f, 199.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_road-horizon-duotone`!!
    }

private var `_road-horizon-duotone`: ImageVector? = null
