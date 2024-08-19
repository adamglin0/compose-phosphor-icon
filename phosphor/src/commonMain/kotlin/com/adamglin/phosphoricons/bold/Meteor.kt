package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 96.0f, 124.0f)
                close()
                moveTo(96.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 172.0f)
                close()
                moveTo(224.49f, 119.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 224.49f, 119.51f)
                close()
                moveTo(188.49f, 99.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(20.0f, -20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.49f, 99.51f)
                close()
                moveTo(232.49f, 72.51f)
                lineTo(216.49f, 88.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(119.49f, 87.51f)
                lineTo(191.49f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                close()
                moveTo(149.72f, 196.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, true, 42.26f, 106.26f)
                lineTo(125.0f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(59.23f, 123.23f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.54f, 73.54f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 149.74f, 196.77f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
