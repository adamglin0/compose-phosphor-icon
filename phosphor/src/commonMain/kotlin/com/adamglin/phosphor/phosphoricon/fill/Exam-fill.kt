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

public val FillGroup.`Exam-fill`: ImageVector
    get() {
        if (`_exam-fill` != null) {
            return `_exam-fill`!!
        }
        `_exam-fill` = Builder(name = "Exam-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 113.89f)
                lineTo(107.06f, 136.0f)
                horizontalLineTo(84.94f)
                close()
                moveTo(232.0f, 56.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.58f, 7.16f)
                lineTo(192.0f, 208.94f)
                lineToRelative(-28.42f, 14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(128.0f, 208.94f)
                lineTo(99.58f, 223.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(64.0f, 208.94f)
                lineTo(35.58f, 223.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 216.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(135.16f, 156.42f)
                lineToRelative(-32.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, 7.16f)
                lineTo(76.94f, 152.0f)
                horizontalLineToRelative(38.12f)
                lineToRelative(5.78f, 11.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.32f, -7.16f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_exam-fill`!!
    }

private var `_exam-fill`: ImageVector? = null
