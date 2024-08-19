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

public val DuotoneGroup.`Baby-carriage-duotone`: ImageVector
    get() {
        if (`_baby-carriage-duotone` != null) {
            return `_baby-carriage-duotone`!!
        }
        `_baby-carriage-duotone` = Builder(name = "Baby-carriage-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 112.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 232.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                lineTo(55.2f, 104.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(223.48f, 104.0f)
                lineTo(166.81f, 104.0f)
                lineToRelative(41.86f, -33.49f)
                arcTo(63.73f, 63.73f, 0.0f, false, true, 223.48f, 104.0f)
                close()
                moveTo(160.0f, 48.0f)
                arcToRelative(63.59f, 63.59f, 0.0f, false, true, 36.69f, 11.61f)
                lineTo(152.0f, 95.35f)
                lineTo(152.0f, 48.0f)
                close()
                moveTo(160.0f, 176.0f)
                lineTo(120.0f, 176.0f)
                arcToRelative(64.09f, 64.09f, 0.0f, false, true, -63.5f, -56.0f)
                horizontalLineToRelative(167.0f)
                arcTo(64.09f, 64.09f, 0.0f, false, true, 160.0f, 176.0f)
                close()
                moveTo(104.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 224.0f)
                close()
                moveTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_baby-carriage-duotone`!!
    }

private var `_baby-carriage-duotone`: ImageVector? = null
