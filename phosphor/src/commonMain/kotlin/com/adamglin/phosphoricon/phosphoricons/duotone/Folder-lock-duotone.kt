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

public val DuotoneGroup.`Folder-lock-duotone`: ImageVector
    get() {
        if (`_folder-lock-duotone` != null) {
            return `_folder-lock-duotone`!!
        }
        `_folder-lock-duotone` = Builder(name = "Folder-lock-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 168.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(168.0f)
                close()
                moveTo(92.69f, 48.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(96.0f)
                lineTo(98.34f, 50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.69f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 160.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 160.0f)
                close()
                moveTo(176.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(176.0f, 160.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(160.0f, 200.0f)
                lineTo(160.0f, 176.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(216.0f, 72.0f)
                lineTo(131.31f, 72.0f)
                lineTo(104.0f, 44.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 92.69f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.62f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 39.38f, 216.0f)
                horizontalLineToRelative(73.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 88.0f)
                lineTo(216.0f, 88.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(92.69f, 56.0f)
                lineToRelative(16.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                lineTo(40.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_folder-lock-duotone`!!
    }

private var `_folder-lock-duotone`: ImageVector? = null
