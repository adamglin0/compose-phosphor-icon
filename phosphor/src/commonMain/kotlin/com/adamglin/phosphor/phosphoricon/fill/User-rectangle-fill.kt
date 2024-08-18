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

public val FillGroup.`User-rectangle-fill`: ImageVector
    get() {
        if (`_user-rectangle-fill` != null) {
            return `_user-rectangle-fill`!!
        }
        `_user-rectangle-fill` = Builder(name = "User-rectangle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 120.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 200.0f)
                lineTo(54.68f, 200.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 29.41f, -34.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, 0.31f)
                arcToRelative(59.82f, 59.82f, 0.0f, false, false, 78.16f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, -0.31f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 201.32f, 200.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_user-rectangle-fill`!!
    }

private var `_user-rectangle-fill`: ImageVector? = null
