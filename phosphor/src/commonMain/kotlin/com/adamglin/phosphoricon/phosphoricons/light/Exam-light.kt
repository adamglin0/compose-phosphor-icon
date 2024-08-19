package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Exam-light`: ImageVector
    get() {
        if (`_exam-light` != null) {
            return `_exam-light`!!
        }
        `_exam-light` = Builder(name = "Exam-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, 5.37f)
                lineTo(64.0f, 206.71f)
                lineToRelative(29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineTo(128.0f, 206.71f)
                lineToRelative(29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineTo(192.0f, 206.71f)
                lineToRelative(29.32f, 14.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 222.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.15f, -0.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 216.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 206.29f)
                lineTo(194.68f, 194.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(160.0f, 209.29f)
                lineToRelative(-29.32f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(96.0f, 209.29f)
                lineTo(66.68f, 194.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(38.0f, 206.29f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(101.37f, 93.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.74f, 5.36f)
                lineTo(75.71f, 150.0f)
                horizontalLineToRelative(40.58f)
                lineToRelative(6.34f, 12.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.74f, -5.36f)
                close()
                moveTo(81.71f, 138.0f)
                lineTo(96.0f, 109.42f)
                lineTo(110.29f, 138.0f)
                close()
                moveTo(198.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(174.0f, 134.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(162.0f, 134.0f)
                lineTo(144.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(162.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_exam-light`!!
    }

private var `_exam-light`: ImageVector? = null
