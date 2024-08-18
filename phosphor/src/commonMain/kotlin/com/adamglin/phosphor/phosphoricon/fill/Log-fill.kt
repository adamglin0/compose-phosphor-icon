package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Log-fill`: ImageVector
    get() {
        if (`_log-fill` != null) {
            return `_log-fill`!!
        }
        `_log-fill` = Builder(name = "Log-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 136.0f)
                close()
                moveTo(248.0f, 136.0f)
                curveToRelative(0.0f, 40.37f, -21.08f, 72.0f, -48.0f, 72.0f)
                lineTo(56.0f, 208.0f)
                curveToRelative(-26.92f, 0.0f, -48.0f, -31.63f, -48.0f, -72.0f)
                reflectiveCurveTo(29.08f, 64.0f, 56.0f, 64.0f)
                lineTo(92.69f, 64.0f)
                lineToRelative(37.65f, -37.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(139.31f, 40.0f)
                lineToRelative(-24.0f, 24.0f)
                lineTo(200.0f, 64.0f)
                curveTo(226.92f, 64.0f, 248.0f, 95.63f, 248.0f, 136.0f)
                close()
                moveTo(104.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(33.26f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                close()
                moveTo(154.91f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(80.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(66.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 154.91f, 160.0f)
                close()
                moveTo(232.0f, 136.0f)
                curveToRelative(0.0f, -30.36f, -14.65f, -56.0f, -32.0f, -56.0f)
                reflectiveCurveToRelative(-32.0f, 25.64f, -32.0f, 56.0f)
                reflectiveCurveToRelative(14.65f, 56.0f, 32.0f, 56.0f)
                reflectiveCurveTo(232.0f, 166.36f, 232.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_log-fill`!!
    }

private var `_log-fill`: ImageVector? = null
