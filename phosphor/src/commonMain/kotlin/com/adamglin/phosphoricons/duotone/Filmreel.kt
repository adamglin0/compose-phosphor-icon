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

public val DuotoneGroup.Filmreel: ImageVector
    get() {
        if (_filmreel != null) {
            return _filmreel!!
        }
        _filmreel = Builder(name = "Filmreel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(80.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 144.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
                moveTo(176.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 216.0f)
                lineTo(183.36f, 216.0f)
                arcTo(103.95f, 103.95f, 0.0f, true, false, 128.0f, 232.0f)
                lineTo(232.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 128.0f, 104.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 72.0f)
                close()
                moveTo(152.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 152.0f, 176.0f)
                close()
                moveTo(120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 176.0f)
                close()
                moveTo(176.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 152.0f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 120.0f)
                close()
                moveTo(80.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 104.0f)
                close()
                moveTo(80.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 136.0f)
                close()
            }
        }
        .build()
        return _filmreel!!
    }

private var _filmreel: ImageVector? = null
