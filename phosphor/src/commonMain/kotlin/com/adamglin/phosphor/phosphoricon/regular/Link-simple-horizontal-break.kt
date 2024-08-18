package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Link-simple-horizontal-break`: ImageVector
    get() {
        if (`_link-simple-horizontal-break` != null) {
            return `_link-simple-horizontal-break`!!
        }
        `_link-simple-horizontal-break` = Builder(name = "Link-simple-horizontal-break",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(64.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 64.0f, 72.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(64.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 24.0f, 128.0f)
                close()
                moveTo(192.0f, 72.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
            }
        }
        .build()
        return `_link-simple-horizontal-break`!!
    }

private var `_link-simple-horizontal-break`: ImageVector? = null
