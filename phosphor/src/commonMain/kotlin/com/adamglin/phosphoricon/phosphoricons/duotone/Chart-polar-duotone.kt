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

public val DuotoneGroup.`Chart-polar-duotone`: ImageVector
    get() {
        if (`_chart-polar-duotone` != null) {
            return `_chart-polar-duotone`!!
        }
        `_chart-polar-duotone` = Builder(name = "Chart-polar-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 184.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(215.63f, 120.0f)
                lineTo(191.48f, 120.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 136.0f, 64.52f)
                lineTo(136.0f, 40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f)
                close()
                moveTo(120.0f, 120.0f)
                lineTo(80.68f, 120.0f)
                arcTo(48.09f, 48.09f, 0.0f, false, true, 120.0f, 80.68f)
                close()
                moveTo(120.0f, 136.0f)
                verticalLineToRelative(39.32f)
                arcTo(48.09f, 48.09f, 0.0f, false, true, 80.68f, 136.0f)
                close()
                moveTo(136.0f, 136.0f)
                horizontalLineToRelative(39.32f)
                arcTo(48.09f, 48.09f, 0.0f, false, true, 136.0f, 175.32f)
                close()
                moveTo(136.0f, 120.0f)
                lineTo(136.0f, 80.68f)
                arcTo(48.09f, 48.09f, 0.0f, false, true, 175.32f, 120.0f)
                close()
                moveTo(120.0f, 40.37f)
                lineTo(120.0f, 64.52f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 64.52f, 120.0f)
                lineTo(40.37f, 120.0f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 120.0f, 40.37f)
                close()
                moveTo(40.37f, 136.0f)
                lineTo(64.52f, 136.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 120.0f, 191.48f)
                verticalLineToRelative(24.15f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 40.37f, 136.0f)
                close()
                moveTo(136.0f, 215.63f)
                lineTo(136.0f, 191.48f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 191.48f, 136.0f)
                horizontalLineToRelative(24.15f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 136.0f, 215.63f)
                close()
            }
        }
        .build()
        return `_chart-polar-duotone`!!
    }

private var `_chart-polar-duotone`: ImageVector? = null
