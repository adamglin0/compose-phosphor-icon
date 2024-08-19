package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Alignbottom: ImageVector
    get() {
        if (_alignbottom != null) {
            return _alignbottom!!
        }
        _alignbottom = Builder(name = "Alignbottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(136.0f, 176.0f)
                lineTo(136.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(152.0f, 192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 136.0f, 176.0f)
                close()
                moveTo(152.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                lineTo(192.0f, 80.0f)
                lineTo(152.0f, 80.0f)
                close()
                moveTo(48.0f, 176.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(120.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 176.0f)
                close()
                moveTo(64.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                lineTo(104.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                close()
            }
        }
        .build()
        return _alignbottom!!
    }

private var _alignbottom: ImageVector? = null
