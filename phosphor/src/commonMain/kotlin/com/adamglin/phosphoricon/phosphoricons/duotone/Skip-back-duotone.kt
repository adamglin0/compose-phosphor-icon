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

public val DuotoneGroup.`Skip-back-duotone`: ImageVector
    get() {
        if (`_skip-back-duotone` != null) {
            return `_skip-back-duotone`!!
        }
        `_skip-back-duotone` = Builder(name = "Skip-back-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.19f, 6.65f)
                lineTo(59.7f, 134.65f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, true, 0.0f, -13.3f)
                lineTo(187.81f, 41.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 47.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.81f, 34.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.24f, 0.43f)
                lineTo(64.0f, 109.23f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(146.77f)
                lineToRelative(119.57f, 74.78f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 208.0f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 199.81f, 34.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(64.16f, 128.0f)
                lineTo(192.0f, 48.07f)
                close()
            }
        }
        .build()
        return `_skip-back-duotone`!!
    }

private var `_skip-back-duotone`: ImageVector? = null
