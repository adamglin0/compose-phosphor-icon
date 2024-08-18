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

public val FillGroup.`Hard-hat-fill`: ImageVector
    get() {
        if (`_hard-hat-fill` != null) {
            return `_hard-hat-fill`!!
        }
        `_hard-hat-fill` = Builder(name = "Hard-hat-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 152.0f)
                lineTo(104.0f, 152.0f)
                lineTo(104.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 168.0f)
                close()
                moveTo(224.0f, 148.0f)
                lineTo(224.0f, 136.0f)
                arcToRelative(96.44f, 96.44f, 0.0f, false, false, -50.11f, -84.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 55.22f)
                lineTo(168.0f, 152.0f)
                horizontalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(36.0f, 152.0f)
                lineTo(88.0f, 152.0f)
                lineTo(88.0f, 55.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.89f, -3.53f)
                arcTo(96.44f, 96.44f, 0.0f, false, false, 32.0f, 136.0f)
                verticalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_hard-hat-fill`!!
    }

private var `_hard-hat-fill`: ImageVector? = null
