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

public val FillGroup.`Hand-soap-fill`: ImageVector
    get() {
        if (`_hand-soap-fill` != null) {
            return `_hand-soap-fill`!!
        }
        `_hand-soap-fill` = Builder(name = "Hand-soap-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 96.8f)
                verticalLineTo(88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(104.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 72.0f, 88.0f)
                verticalLineToRelative(8.8f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 40.0f, 136.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(136.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 184.0f, 96.8f)
                close()
                moveTo(104.0f, 72.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_hand-soap-fill`!!
    }

private var `_hand-soap-fill`: ImageVector? = null
