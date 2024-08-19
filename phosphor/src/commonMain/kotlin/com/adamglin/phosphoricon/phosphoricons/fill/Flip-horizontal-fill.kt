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

public val FillGroup.`Flip-horizontal-fill`: ImageVector
    get() {
        if (`_flip-horizontal-fill` != null) {
            return `_flip-horizontal-fill`!!
        }
        `_flip-horizontal-fill` = Builder(name = "Flip-horizontal-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.78f, -22.15f)
                lineToRelative(64.0f, -159.93f)
                lineToRelative(0.06f, -0.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 40.0f)
                close()
                moveTo(229.33f, 208.84f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 216.0f)
                horizontalLineTo(152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 30.74f, -6.23f)
                lineToRelative(0.06f, 0.14f)
                lineToRelative(64.0f, 159.93f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 229.33f, 208.84f)
                close()
                moveTo(216.0f, 200.0f)
                lineToRelative(-0.06f, -0.15f)
                lineTo(152.0f, 40.0f)
                verticalLineTo(200.0f)
                close()
            }
        }
        .build()
        return `_flip-horizontal-fill`!!
    }

private var `_flip-horizontal-fill`: ImageVector? = null
