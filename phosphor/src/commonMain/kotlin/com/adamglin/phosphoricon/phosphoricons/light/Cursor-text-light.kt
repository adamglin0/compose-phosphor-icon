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

public val LightGroup.`Cursor-text-light`: ImageVector
    get() {
        if (`_cursor-text-light` != null) {
            return `_cursor-text-light`!!
        }
        `_cursor-text-light` = Builder(name = "Cursor-text-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(160.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -32.0f, -17.55f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 96.0f, 214.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(80.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 96.0f, 54.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 32.0f, 17.55f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 160.0f, 42.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(160.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f)
                verticalLineToRelative(42.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineToRelative(16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_cursor-text-light`!!
    }

private var `_cursor-text-light`: ImageVector? = null
