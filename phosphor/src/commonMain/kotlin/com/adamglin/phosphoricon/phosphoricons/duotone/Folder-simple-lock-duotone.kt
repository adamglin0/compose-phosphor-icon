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

public val DuotoneGroup.`Folder-simple-lock-duotone`: ImageVector
    get() {
        if (`_folder-simple-lock-duotone` != null) {
            return `_folder-simple-lock-duotone`!!
        }
        `_folder-simple-lock-duotone` = Builder(name = "Folder-simple-lock-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 168.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                lineTo(130.67f, 88.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, -9.6f, -3.2f)
                lineTo(93.33f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.33f, 48.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.67f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
                moveTo(232.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(152.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 168.0f)
                close()
                moveTo(176.0f, 160.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(160.0f, 176.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return `_folder-simple-lock-duotone`!!
    }

private var `_folder-simple-lock-duotone`: ImageVector? = null
