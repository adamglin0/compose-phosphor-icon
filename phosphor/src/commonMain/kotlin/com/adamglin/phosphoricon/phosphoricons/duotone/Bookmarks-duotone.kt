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

public val DuotoneGroup.`Bookmarks-duotone`: ImageVector
    get() {
        if (`_bookmarks-duotone` != null) {
            return `_bookmarks-duotone`!!
        }
        `_bookmarks-duotone` = Builder(name = "Bookmarks-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                verticalLineTo(192.0f)
                lineToRelative(-32.0f, -22.85f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 24.0f)
                lineTo(96.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 40.0f)
                lineTo(80.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.65f, 6.51f)
                lineTo(112.0f, 193.83f)
                lineToRelative(51.36f, 36.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 224.0f)
                lineTo(176.0f, 184.69f)
                lineToRelative(19.35f, 13.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 192.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 24.0f)
                close()
                moveTo(160.0f, 208.46f)
                lineToRelative(-43.36f, -31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f)
                lineTo(64.0f, 208.45f)
                lineTo(64.0f, 72.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(192.0f, 176.46f)
                lineTo(176.0f, 165.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return `_bookmarks-duotone`!!
    }

private var `_bookmarks-duotone`: ImageVector? = null
