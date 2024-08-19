package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Vector-three-duotone`: ImageVector
    get() {
        if (`_vector-three-duotone` != null) {
            return `_vector-three-duotone`!!
        }
        `_vector-three-duotone` = Builder(name = "Vector-three-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 40.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(-67.31f, 67.31f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 153.37f, 208.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(102.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 4.69f, -11.32f)
                lineTo(120.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 141.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(212.69f, 144.0f)
                horizontalLineTo(123.31f)
                lineToRelative(-56.0f, 56.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(28.69f)
                lineToRelative(56.0f, -56.0f)
                verticalLineTo(43.31f)
                lineTo(93.66f, 61.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 82.34f, 50.34f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(128.0f, 43.31f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(84.69f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 141.66f)
                close()
            }
        }
        .build()
        return `_vector-three-duotone`!!
    }

private var `_vector-three-duotone`: ImageVector? = null
