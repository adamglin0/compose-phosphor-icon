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

public val FillGroup.`Cards-three-fill`: ImageVector
    get() {
        if (`_cards-three-fill` != null) {
            return `_cards-three-fill`!!
        }
        `_cards-three-fill` = Builder(name = "Cards-three-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 88.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 104.0f)
                close()
                moveTo(56.0f, 72.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(72.0f, 40.0f)
                horizontalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_cards-three-fill`!!
    }

private var `_cards-three-fill`: ImageVector? = null
