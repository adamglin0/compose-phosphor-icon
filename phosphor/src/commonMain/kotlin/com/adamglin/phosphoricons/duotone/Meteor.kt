package com.adamglin.phosphoricons.duotone

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
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 96.0f, 120.0f)
                close()
                moveTo(96.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 184.0f)
                close()
                moveTo(221.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 122.34f)
                close()
                moveTo(165.66f, 133.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(229.66f, 69.66f)
                lineTo(213.66f, 85.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(122.34f, 90.34f)
                lineToRelative(72.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
                moveTo(146.91f, 199.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                arcTo(72.0f, 72.0f, 0.0f, true, true, 45.09f, 109.09f)
                lineToRelative(82.74f, -82.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineTo(56.4f, 120.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 79.2f, 79.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 146.91f, 199.6f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
