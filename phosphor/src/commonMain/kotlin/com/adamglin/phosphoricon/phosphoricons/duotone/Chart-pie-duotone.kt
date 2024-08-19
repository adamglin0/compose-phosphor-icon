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

public val DuotoneGroup.`Chart-pie-duotone`: ImageVector
    get() {
        if (`_chart-pie-duotone` != null) {
            return `_chart-pie-duotone`!!
        }
        `_chart-pie-duotone` = Builder(name = "Chart-pie-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                verticalLineToRelative(96.0f)
                lineTo(44.86f, 176.0f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(199.87f, 77.27f)
                lineTo(136.0f, 114.14f)
                lineTo(136.0f, 40.37f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 199.87f, 77.27f)
                close()
                moveTo(120.0f, 40.37f)
                verticalLineToRelative(83.0f)
                lineToRelative(-71.89f, 41.5f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 120.0f, 40.37f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -71.87f, -37.27f)
                lineTo(207.89f, 91.12f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_chart-pie-duotone`!!
    }

private var `_chart-pie-duotone`: ImageVector? = null
