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

public val FillGroup.`Translate-fill`: ImageVector
    get() {
        if (`_translate-fill` != null) {
            return `_translate-fill`!!
        }
        `_translate-fill` = Builder(name = "Translate-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 129.89f)
                lineTo(175.06f, 160.0f)
                horizontalLineTo(144.94f)
                lineToRelative(6.36f, -12.7f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(207.16f, 188.42f)
                lineToRelative(-40.0f, -80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 0.0f)
                lineTo(139.66f, 134.8f)
                arcToRelative(62.31f, 62.31f, 0.0f, false, true, -23.61f, -10.0f)
                arcTo(79.61f, 79.61f, 0.0f, false, false, 135.6f, 80.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(63.48f)
                arcToRelative(63.73f, 63.73f, 0.0f, false, true, -15.3f, 34.05f)
                arcToRelative(65.93f, 65.93f, 0.0f, false, true, -9.0f, -13.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 7.12f)
                arcToRelative(81.75f, 81.75f, 0.0f, false, false, 11.4f, 17.15f)
                arcTo(63.62f, 63.62f, 0.0f, false, true, 56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(79.56f, 79.56f, 0.0f, false, false, 48.11f, -16.13f)
                arcToRelative(78.33f, 78.33f, 0.0f, false, false, 28.18f, 13.66f)
                lineToRelative(-19.45f, 38.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, 7.16f)
                lineTo(136.94f, 176.0f)
                horizontalLineToRelative(46.12f)
                lineToRelative(9.78f, 19.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.32f, -7.16f)
                close()
            }
        }
        .build()
        return `_translate-fill`!!
    }

private var `_translate-fill`: ImageVector? = null
