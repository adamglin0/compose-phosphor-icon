package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Question-mark-thin`: ImageVector
    get() {
        if (`_question-mark-thin` != null) {
            return `_question-mark-thin`!!
        }
        `_question-mark-thin` = Builder(name = "Question-mark-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 96.0f)
                curveToRelative(0.0f, 27.51f, -24.77f, 50.09f, -56.0f, 51.89f)
                verticalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                curveToRelative(28.67f, 0.0f, 52.0f, -19.74f, 52.0f, -44.0f)
                reflectiveCurveToRelative(-23.33f, -44.0f, -52.0f, -44.0f)
                reflectiveCurveTo(76.0f, 71.74f, 76.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                curveToRelative(0.0f, -28.67f, 26.92f, -52.0f, 60.0f, -52.0f)
                reflectiveCurveTo(188.0f, 67.33f, 188.0f, 96.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_question-mark-thin`!!
    }

private var `_question-mark-thin`: ImageVector? = null
