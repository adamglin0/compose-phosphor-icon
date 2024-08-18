package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Question-mark`: ImageVector
    get() {
        if (`_question-mark` != null) {
            return `_question-mark`!!
        }
        `_question-mark` = Builder(name = "Question-mark", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                curveToRelative(0.0f, 28.51f, -24.47f, 52.11f, -56.0f, 55.56f)
                lineTo(136.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                curveToRelative(26.47f, 0.0f, 48.0f, -17.94f, 48.0f, -40.0f)
                reflectiveCurveToRelative(-21.53f, -40.0f, -48.0f, -40.0f)
                reflectiveCurveTo(80.0f, 73.94f, 80.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -30.88f, 28.71f, -56.0f, 64.0f, -56.0f)
                reflectiveCurveTo(192.0f, 65.12f, 192.0f, 96.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_question-mark`!!
    }

private var `_question-mark`: ImageVector? = null
