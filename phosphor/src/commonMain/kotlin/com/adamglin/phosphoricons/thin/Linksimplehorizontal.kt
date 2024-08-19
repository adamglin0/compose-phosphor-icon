package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Linksimplehorizontal: ImageVector
    get() {
        if (_linksimplehorizontal != null) {
            return _linksimplehorizontal!!
        }
        _linksimplehorizontal = Builder(name = "Linksimplehorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 124.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(80.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(104.0f, 172.0f)
                lineTo(64.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, -88.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(64.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(192.0f, 76.0f)
                lineTo(152.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                lineTo(152.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
            }
        }
        .build()
        return _linksimplehorizontal!!
    }

private var _linksimplehorizontal: ImageVector? = null
