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

public val FillGroup.`Tote-simple-fill`: ImageVector
    get() {
        if (`_tote-simple-fill` != null) {
            return `_tote-simple-fill`!!
        }
        `_tote-simple-fill` = Builder(name = "Tote-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 69.4f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 223.92f, 64.0f)
                horizontalLineTo(176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                horizontalLineTo(32.08f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, -12.0f, 5.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.92f, 12.48f)
                lineToRelative(14.26f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 14.12f)
                horizontalLineTo(209.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -14.12f)
                lineToRelative(14.26f, -120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 236.0f, 69.4f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                horizontalLineTo(96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_tote-simple-fill`!!
    }

private var `_tote-simple-fill`: ImageVector? = null
