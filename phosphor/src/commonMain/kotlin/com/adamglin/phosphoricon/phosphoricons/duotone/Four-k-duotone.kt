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

public val DuotoneGroup.`Four-k-duotone`: ImageVector
    get() {
        if (`_four-k-duotone` != null) {
            return `_four-k-duotone`!!
        }
        `_four-k-duotone` = Builder(name = "Four-k-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(224.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 48.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 147.0f)
                lineToRelative(13.09f, -15.0f)
                lineToRelative(28.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 206.91f, 172.0f)
                lineToRelative(-30.7f, -52.63f)
                lineTo(206.0f, 85.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, -10.54f)
                lineToRelative(-42.0f, 48.0f)
                lineTo(152.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 72.0f)
                close()
                moveTo(88.0f, 176.0f)
                lineTo(88.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.31f, -12.91f)
                lineToRelative(56.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 80.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(88.0f, 144.0f)
                lineTo(88.0f, 103.32f)
                lineTo(56.36f, 144.0f)
                close()
            }
        }
        .build()
        return `_four-k-duotone`!!
    }

private var `_four-k-duotone`: ImageVector? = null
