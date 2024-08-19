package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Question-fill`: ImageVector
    get() {
        if (`_question-fill` != null) {
            return `_question-fill`!!
        }
        `_question-fill` = Builder(name = "Question-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(136.0f, 143.28f)
                lineTo(136.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                curveToRelative(13.23f, 0.0f, 24.0f, -9.0f, 24.0f, -20.0f)
                reflectiveCurveToRelative(-10.77f, -20.0f, -24.0f, -20.0f)
                reflectiveCurveToRelative(-24.0f, 9.0f, -24.0f, 20.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -19.85f, 17.94f, -36.0f, 40.0f, -36.0f)
                reflectiveCurveToRelative(40.0f, 16.15f, 40.0f, 36.0f)
                curveTo(168.0f, 125.38f, 154.24f, 139.93f, 136.0f, 143.28f)
                close()
            }
        }
        .build()
        return `_question-fill`!!
    }

private var `_question-fill`: ImageVector? = null
