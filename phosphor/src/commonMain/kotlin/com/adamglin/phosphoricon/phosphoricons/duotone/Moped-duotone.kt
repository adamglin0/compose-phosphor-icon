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

public val DuotoneGroup.`Moped-duotone`: ImageVector
    get() {
        if (`_moped-duotone` != null) {
            return `_moped-duotone`!!
        }
        `_moped-duotone` = Builder(name = "Moped-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(131.0f, 168.0f)
                horizontalLineTo(8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 32.0f, -45.27f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, false, -6.27f, 0.5f)
                lineTo(175.49f, 37.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.46f)
                lineToRelative(32.3f, 86.13f)
                arcToRelative(40.13f, 40.13f, 0.0f, false, false, -18.0f, 25.87f)
                horizontalLineTo(136.54f)
                lineToRelative(-25.0f, -66.81f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(13.39f)
                arcTo(56.12f, 56.12f, 0.0f, false, false, 0.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(8.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f)
                horizontalLineToRelative(81.6f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 216.0f, 128.0f)
                close()
                moveTo(56.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f)
                horizontalLineTo(78.62f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 192.0f)
                close()
                moveTo(16.81f, 160.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, true, 25.86f, -29.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 122.73f)
                verticalLineTo(104.0f)
                horizontalLineTo(98.46f)
                lineToRelative(21.0f, 56.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -15.43f, -42.36f)
                lineToRelative(7.94f, 21.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, -5.62f)
                lineTo(215.55f, 144.0f)
                horizontalLineTo(216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_moped-duotone`!!
    }

private var `_moped-duotone`: ImageVector? = null
