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

public val DuotoneGroup.`Chart-scatter-duotone`: ImageVector
    get() {
        if (`_chart-scatter-duotone` != null) {
            return `_chart-scatter-duotone`!!
        }
        `_chart-scatter-duotone` = Builder(name = "Chart-scatter-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(40.0f, 200.0f)
                lineTo(224.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f)
                close()
                moveTo(132.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 160.0f)
                close()
                moveTo(108.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 96.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 104.0f)
                close()
                moveTo(76.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 176.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 128.0f)
                close()
                moveTo(196.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 88.0f)
                close()
                moveTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_chart-scatter-duotone`!!
    }

private var `_chart-scatter-duotone`: ImageVector? = null
