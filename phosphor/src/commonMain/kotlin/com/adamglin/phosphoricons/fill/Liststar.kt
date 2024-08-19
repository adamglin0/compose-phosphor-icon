package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Liststar: ImageVector
    get() {
        if (_liststar != null) {
            return _liststar!!
        }
        _liststar = Builder(name = "Liststar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(64.0f, 72.0f)
                lineTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(64.0f, 120.0f)
                lineTo(96.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(104.0f, 184.0f)
                lineTo(64.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(198.55f, 143.29f)
                lineTo(180.69f, 158.0f)
                lineToRelative(5.44f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 4.17f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.39f, 0.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.55f)
                lineTo(160.0f, 172.54f)
                lineToRelative(-20.22f, 11.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.91f, -4.41f)
                lineToRelative(5.44f, -22.0f)
                lineToRelative(-17.86f, -14.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, -7.07f)
                lineToRelative(23.58f, -1.82f)
                lineToRelative(9.06f, -21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.34f, 0.0f)
                lineToRelative(9.06f, 21.0f)
                lineToRelative(23.58f, 1.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, 7.07f)
                close()
            }
        }
        .build()
        return _liststar!!
    }

private var _liststar: ImageVector? = null
