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

public val FillGroup.`Brackets-angle-fill`: ImageVector
    get() {
        if (`_brackets-angle-fill` != null) {
            return `_brackets-angle-fill`!!
        }
        `_brackets-angle-fill` = Builder(name = "Brackets-angle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(103.0f, 180.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 89.05f, 188.0f)
                lineToRelative(-32.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -7.94f)
                lineToRelative(32.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 103.0f, 76.0f)
                lineTo(73.21f, 128.0f)
                close()
                moveTo(199.0f, 132.0f)
                lineToRelative(-32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, -7.94f)
                lineToRelative(29.74f, -52.0f)
                lineTo(153.05f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 167.0f, 68.0f)
                lineToRelative(32.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 199.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_brackets-angle-fill`!!
    }

private var `_brackets-angle-fill`: ImageVector? = null
